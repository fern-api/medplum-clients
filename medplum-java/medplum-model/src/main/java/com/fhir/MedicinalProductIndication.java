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
    as = ImmutableMedicinalProductIndication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIndication {
  Optional<id> id();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy();

  String resourceType();

  Optional<Quantity> duration();

  Optional<List<Population>> population();

  Optional<uri> implicitRules();

  Optional<code> language();

  Optional<CodeableConcept> diseaseSymptomProcedure();

  Optional<CodeableConcept> diseaseStatus();

  Optional<List<CodeableConcept>> comorbidity();

  Optional<List<Reference>> undesirableEffect();

  Optional<CodeableConcept> intendedEffect();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> subject();

  static ImmutableMedicinalProductIndication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductIndication.builder();
  }
}
