package com.fuqiang.springbootsharding.config.sharding.book;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;

/**
 * <p>Title: ShardingDatabaseAlgorithmConfig</p>
 * <p>Description: ShardingDatabaseAlgorithmConfig</p>
 * <p>Copyright: Xi An BestTop Technologies, ltd. Copyright(c) 2018/p>
 *
 * @author Fuqiang
 * @version 0.0.0.1
 * <pre>Histroy:
 *       2020/4/8 0008 9:41 Create by Fuqiang
 * </pre>
 * <p>
 * <p>
 * TODO     分库算法实现
 */
@Configuration
public class ShardingBookDatabaseConfig implements PreciseShardingAlgorithm<String> {

    /**
     *  availableTargetNames是yml拿到的数据源集合，如db0,db1...
     *  shardingValue是yml中的数据表信息，有逻辑表名，表分片字段，该分片字段的value值
     */
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
        for (String availableTargetName : availableTargetNames) {
            Long value = Long.parseLong(shardingValue.getValue());
            String dataSourceName = "db" + (value % 2);
            if (availableTargetName.equals(dataSourceName)) {
                return availableTargetName;
            }
        }
        return null;
    }
}
