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
    as = ImmutableMedicinalProduct.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProduct {
  Optional<CodeableConcept> additionalMonitoringIndicator();

  Optional<List<ResourceList>> contained();

  Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation();

  Optional<List<String>> specialMeasures();

  Optional<List<Reference>> attachedDocument();

  Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> combinedPharmaceuticalDoseForm();

  Optional<List<Reference>> clinicalTrial();

  Optional<CodeableConcept> type();

  List<MedicinalProduct_Name> name();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> masterFile();

  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<List<CodeableConcept>> productClassification();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<CodeableConcept> paediatricUseIndicator();

  Optional<Id> id();

  Optional<Uri> implicitRules();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<Coding> domain();

  Optional<List<Reference>> contact();

  Optional<List<Identifier>> identifier();

  Optional<List<Identifier>> crossReference();

  Optional<Meta> meta();

  Optional<List<Reference>> pharmaceuticalProduct();

  Optional<List<Reference>> packagedMedicinalProduct();

  static ImmutableMedicinalProduct.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProduct.builder();
  }
}
