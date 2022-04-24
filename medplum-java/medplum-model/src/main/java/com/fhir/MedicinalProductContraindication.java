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
    as = ImmutableMedicinalProductContraindication.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductContraindication {
  String resourceType();

  Optional<id> id();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> subject();

  Optional<Meta> meta();

  Optional<CodeableConcept> disease();

  Optional<CodeableConcept> diseaseStatus();

  Optional<uri> implicitRules();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> comorbidity();

  Optional<List<Population>> population();

  Optional<List<Reference>> therapeuticIndication();

  Optional<code> language();

  Optional<List<MedicinalProductContraindication_OtherTherapy>> otherTherapy();

  static ImmutableMedicinalProductContraindication.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductContraindication.builder();
  }
}
