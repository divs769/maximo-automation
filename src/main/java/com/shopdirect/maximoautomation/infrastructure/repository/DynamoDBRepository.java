package com.shopdirect.maximoautomation.infrastructure.repository;

import com.shopdirect.maximoautomation.infrastructure.model.BuildInfo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.socialsignin.spring.data.dynamodb.repository.EnableScanCount;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

@EnableScan
@EnableScanCount
public interface DynamoDBRepository extends PagingAndSortingRepository<BuildInfo, UUID> {
    BuildInfo findByBuildId(String buildId);
}
