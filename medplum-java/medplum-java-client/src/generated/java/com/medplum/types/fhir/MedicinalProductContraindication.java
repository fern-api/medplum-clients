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
  Optional<Meta> meta();

  Optional<List<Reference>> subject();

  Optional<List<CodeableConcept>> comorbidity();

  String resourceType();

  Optional<List<MedicinalProductContraindication_OtherTherapy>> otherTherapy();

  Optional<CodeableConcept> disease();

  Optional<Id> id();

  Optional<List<Reference>> therapeuticIndication();

  Optional<List<ResourceList>> contained();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> diseaseStatus();

  Optional<List<Population>> population();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  static ImmutableMedicinalProductContraindication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductContraindication.builder();
  }
}
