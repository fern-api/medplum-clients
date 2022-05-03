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
  Optional<Code> language();

  Optional<List<Reference>> subject();

  Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy();

  Optional<CodeableConcept> diseaseStatus();

  Optional<CodeableConcept> intendedEffect();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<Quantity> duration();

  Optional<List<Reference>> undesirableEffect();

  String resourceType();

  Optional<CodeableConcept> diseaseSymptomProcedure();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<List<Population>> population();

  Optional<List<CodeableConcept>> comorbidity();

  static ImmutableMedicinalProductIndication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductIndication.builder();
  }
}
