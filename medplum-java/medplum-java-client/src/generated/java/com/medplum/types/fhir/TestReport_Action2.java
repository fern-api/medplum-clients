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
    as = ImmutableTestReport_Action2.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Action2 {
  TestReport_Operation operation();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  static ImmutableTestReport_Action2.OperationBuildStage builder() {
    return ImmutableTestReport_Action2.builder();
  }
}
