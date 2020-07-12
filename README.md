# Java Libraries - APIs - Tools
[//]: # (TODO: add list of topics)
 
## Lombok
- [Jar/Maven](https://search.maven.org/search?q=g:org.projectlombok%20AND%20a:lombok&core=gav)
- [Features](https://projectlombok.org/features/all)
- [Implementation](https://github.com/peichhorn/lombok-pg)

#### Basic annotations [[LombokDriver]()]
- [@Log](https://projectlombok.org/features/log)
- [@AllArgsConstructor - @NoArgsConstructor](https://projectlombok.org/features/constructor)
- [@RequiredArgsConstructor](@NoArgsConstructor)
: for final or non-null attributes
- [@ToString](https://projectlombok.org/features/ToString)
- [@Getter - @Setter](https://projectlombok.org/features/GetterSetter)
- [@Setter(AccessLevel.PROTECTED/PUBLIC/PACKAGE/PRIVATE)](https://projectlombok.org/features/GetterSetter)
- [@Builder](https://projectlombok.org/features/Builder)
- [@NonNull](https://projectlombok.org/features/NonNull)
- [@Cleanup](https://projectlombok.org/features/Cleanup)
: call close() methods


#### Combining annotations
- [@Data](https://projectlombok.org/features/Data) 
=  @ToString + @EqualsAndHashCode + @Getter + @Setter + @RequiredArgsConstructor




















































