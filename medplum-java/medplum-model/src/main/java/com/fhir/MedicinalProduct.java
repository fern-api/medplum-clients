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
    as = ImmutableMedicinalProduct.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct {
  Optional<code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<List<String>> specialMeasures();

  Optional<List<Reference>> clinicalTrial();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> masterFile();

  Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<List<Reference>> pharmaceuticalProduct();

  Optional<id> id();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<CodeableConcept> combinedPharmaceuticalDoseForm();

  Optional<CodeableConcept> paediatricUseIndicator();

  Optional<Coding> domain();

  Optional<Narrative> text();

  Optional<List<Identifier>> crossReference();

  Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation();

  Optional<CodeableConcept> type();

  Optional<Meta> meta();

  Optional<uri> implicitRules();

  Optional<CodeableConcept> additionalMonitoringIndicator();

  Optional<List<Reference>> packagedMedicinalProduct();

  Optional<List<Reference>> attachedDocument();

  Optional<List<CodeableConcept>> productClassification();

  Optional<List<Reference>> contact();

  List<MedicinalProduct_Name> name();

  static ImmutableMedicinalProduct.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProduct.builder();
  }
}
