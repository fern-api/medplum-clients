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
    as = ImmutableTestReport_Setup.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Setup {
  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  List<TestReport_Action> action();

  Optional<List<Extension>> extension();

  static ImmutableTestReport_Setup.Builder builder() {
    return ImmutableTestReport_Setup.builder();
  }
}
