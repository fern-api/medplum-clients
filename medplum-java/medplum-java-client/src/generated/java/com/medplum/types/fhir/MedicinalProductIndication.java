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
    as = ImmutableMedicinalProductIndication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductIndication {
  Optional<List<Extension>> extension();

  Optional<List<Reference>> undesirableEffect();

  Optional<Uri> implicitRules();

  Optional<List<Reference>> subject();

  Optional<Id> id();

  Optional<Code> language();

  Optional<Quantity> duration();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> comorbidity();

  Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy();

  Optional<List<Population>> population();

  String resourceType();

  Optional<CodeableConcept> diseaseSymptomProcedure();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> diseaseStatus();

  Optional<Meta> meta();

  Optional<CodeableConcept> intendedEffect();

  static ImmutableMedicinalProductIndication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductIndication.builder();
  }
}
