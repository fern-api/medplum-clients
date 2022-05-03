package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableProjectReference.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProjectReference {
  String reference();

  String display();

  static ImmutableProjectReference.ReferenceBuildStage builder() {
    return ImmutableProjectReference.builder();
  }
}
