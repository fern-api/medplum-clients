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

  Optional<Id> id();

  Optional<List<CodeableConcept>> comorbidity();

  Optional<List<Reference>> therapeuticIndication();

  Optional<List<Extension>> extension();

  Optional<CodeableConcept> diseaseStatus();

  String resourceType();

  Optional<List<MedicinalProductContraindication_OtherTherapy>> otherTherapy();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Reference>> subject();

  Optional<Meta> meta();

  Optional<List<Population>> population();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicinalProductContraindication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductContraindication.builder();
  }
}
