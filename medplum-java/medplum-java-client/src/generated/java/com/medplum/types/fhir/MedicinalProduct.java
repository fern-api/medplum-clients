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
  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  Optional<CodeableConcept> paediatricUseIndicator();

  Optional<Coding> domain();

  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<List<String>> specialMeasures();

  Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation();

  String resourceType();

  Optional<List<Reference>> pharmaceuticalProduct();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> productClassification();

  Optional<List<Extension>> extension();

  Optional<List<Reference>> clinicalTrial();

  List<MedicinalProduct_Name> name();

  Optional<List<Identifier>> crossReference();

  Optional<List<Reference>> packagedMedicinalProduct();

  Optional<CodeableConcept> combinedPharmaceuticalDoseForm();

  Optional<CodeableConcept> additionalMonitoringIndicator();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> attachedDocument();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation();

  Optional<List<Reference>> masterFile();

  Optional<List<Reference>> contact();

  Optional<Id> id();

  static ImmutableMedicinalProduct.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProduct.builder();
  }
}
