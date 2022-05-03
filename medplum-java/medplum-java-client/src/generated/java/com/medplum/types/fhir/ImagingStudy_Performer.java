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
    as = ImmutableImagingStudy_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImagingStudy_Performer {
  Optional<String> id();

  Reference actor();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> function();

  Optional<List<Extension>> extension();

  static ImmutableImagingStudy_Performer.ActorBuildStage builder() {
    return ImmutableImagingStudy_Performer.builder();
  }
}
