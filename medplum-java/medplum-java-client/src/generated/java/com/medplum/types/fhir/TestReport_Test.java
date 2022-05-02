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
  List<TestReport_Action1> action();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> description();

  Optional<String> name();

  static ImmutableTestReport_Test.Builder builder() {
    return ImmutableTestReport_Test.builder();
  }
}