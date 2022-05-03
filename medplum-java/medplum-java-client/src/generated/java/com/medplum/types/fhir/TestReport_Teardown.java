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
    as = ImmutableTestReport_Teardown.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Teardown {
  Optional<String> id();

  List<TestReport_Action2> action();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableTestReport_Teardown.Builder builder() {
    return ImmutableTestReport_Teardown.builder();
  }
}
