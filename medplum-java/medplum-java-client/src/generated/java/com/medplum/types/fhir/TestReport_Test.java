package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestReport_Test.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Test {
  Optional<List<Extension>> extension();

  Optional<String> name();

  List<TestReport_Action1> action();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<String> description();

  static ImmutableTestReport_Test.Builder builder() {
    return ImmutableTestReport_Test.builder();
  }
}
