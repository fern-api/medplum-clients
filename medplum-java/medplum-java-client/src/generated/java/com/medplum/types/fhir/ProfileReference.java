package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableProfileReference.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ProfileReference {
  String display();

  String reference();

  static ImmutableProfileReference.DisplayBuildStage builder() {
    return ImmutableProfileReference.builder();
  }
}
