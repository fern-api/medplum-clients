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
  Optional<List<Reference>> masterFile();

  Optional<List<Identifier>> crossReference();

  Optional<List<Extension>> extension();

  Optional<Coding> domain();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> paediatricUseIndicator();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<List<CodeableConcept>> productClassification();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation();

  List<MedicinalProduct_Name> name();

  Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation();

  Optional<List<Reference>> packagedMedicinalProduct();

  Optional<CodeableConcept> additionalMonitoringIndicator();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<Id> id();

  Optional<List<Reference>> pharmaceuticalProduct();

  Optional<List<Reference>> clinicalTrial();

  Optional<CodeableConcept> combinedPharmaceuticalDoseForm();

  Optional<Narrative> text();

  Optional<List<Reference>> attachedDocument();

  Optional<List<String>> specialMeasures();

  String resourceType();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> type();

  Optional<List<Reference>> contact();

  static ImmutableMedicinalProduct.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProduct.builder();
  }
}
