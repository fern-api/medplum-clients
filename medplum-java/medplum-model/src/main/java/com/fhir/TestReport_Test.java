package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> name();

  Optional<List<Extension>> modifierExtension();

  List<TestReport_Action1> action();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<String> id();

  static ImmutableTestReport_Test.Builder builder() {
    return ImmutableTestReport_Test.builder();
  }
}
