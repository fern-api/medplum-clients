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
    as = ImmutableMedicinalProductContraindication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductContraindication {
  Optional<CodeableConcept> disease();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<MedicinalProductContraindication_OtherTherapy>> otherTherapy();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> diseaseStatus();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  Optional<List<Reference>> subject();

  Optional<List<Population>> population();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> comorbidity();

  Optional<Narrative> text();

  String resourceType();

  Optional<List<Reference>> therapeuticIndication();

  static ImmutableMedicinalProductContraindication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductContraindication.builder();
  }
}
