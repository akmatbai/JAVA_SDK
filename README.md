# JAVA_SDK

Production-grade multi-module Java SDK for merchant integration with bank E-comm XML API over HTTPS + mTLS.

## Modules

- `ecomm-sdk-core` (Java 11): framework-agnostic SDK core.
- `ecomm-sdk-spring-boot-starter` (Java 17): optional Spring Boot auto-configuration.
- `ecomm-sdk-testkit`: test helpers for SDK consumers.
- `ecomm-sdk-mock-server`: local/mock integration endpoint scaffolding.
- `ecomm-sdk-examples`: usage examples.
- `ecomm-sdk-bom`: dependency management BOM.

## Current status

Initial architecture scaffold is implemented with:

- public facade entrypoint: `EcommClient`
- typed service groups: payments, status, refunds, tokens, recurring, advanced/raw
- immutable request/response model skeletons with builders
- transport abstraction + JDK `HttpClient` transport
- custom StAX XML writer/reader skeletons
- callback parser/verifier extension points
- diagnostic masking abstractions
- exception model for technical/integration failures

## Build

```bash
mvn -DskipTests compile
```

## Notes

- This repository is in active implementation phase.
- Some bank XML contracts are intentionally marked with `TODO` where specification details are missing.
