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
  Optional<List<Reference>> undesirableEffect();

  Optional<List<CodeableConcept>> comorbidity();

  Optional<CodeableConcept> diseaseStatus();

  Optional<Narrative> text();

  Optional<Code> language();

  Optional<CodeableConcept> diseaseSymptomProcedure();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<Quantity> duration();

  Optional<List<Population>> population();

  Optional<CodeableConcept> intendedEffect();

  Optional<List<Reference>> subject();

  Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  static ImmutableMedicinalProductIndication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductIndication.builder();
  }
}
