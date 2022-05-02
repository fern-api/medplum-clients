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
    as = ImmutableProcedure_Performer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Procedure_Performer {
  Optional<Reference> onBehalfOf();

  Optional<String> id();

  Optional<CodeableConcept> function();

  Reference actor();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  static ImmutableProcedure_Performer.ActorBuildStage builder() {
    return ImmutableProcedure_Performer.builder();
  }
}
