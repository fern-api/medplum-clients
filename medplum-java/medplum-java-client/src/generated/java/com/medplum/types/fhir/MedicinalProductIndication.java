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
  Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<List<Reference>> subject();

  Optional<List<CodeableConcept>> comorbidity();

  Optional<Code> language();

  Optional<Quantity> duration();

  Optional<Meta> meta();

  Optional<Narrative> text();

  Optional<CodeableConcept> diseaseStatus();

  Optional<List<Population>> population();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> intendedEffect();

  Optional<List<Reference>> undesirableEffect();

  Optional<CodeableConcept> diseaseSymptomProcedure();

  Optional<Id> id();

  static ImmutableMedicinalProductIndication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductIndication.builder();
  }
}
