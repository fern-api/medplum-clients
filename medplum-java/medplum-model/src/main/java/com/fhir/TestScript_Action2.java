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
    as = ImmutableTestScript_Action2.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestScript_Action2 {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  TestScript_Operation operation();

  Optional<List<Extension>> extension();

  static ImmutableTestScript_Action2.OperationBuildStage builder() {
    return ImmutableTestScript_Action2.builder();
  }
}
