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
  Optional<List<String>> specialMeasures();

  Optional<CodeableConcept> paediatricUseIndicator();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> crossReference();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<Code> language();

  Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation();

  Optional<List<Identifier>> identifier();

  Optional<CodeableConcept> legalStatusOfSupply();

  List<MedicinalProduct_Name> name();

  Optional<List<Reference>> contact();

  Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> pharmaceuticalProduct();

  Optional<CodeableConcept> type();

  Optional<CodeableConcept> combinedPharmaceuticalDoseForm();

  Optional<List<CodeableConcept>> productClassification();

  Optional<Coding> domain();

  Optional<List<Reference>> attachedDocument();

  Optional<List<Reference>> clinicalTrial();

  Optional<List<Reference>> packagedMedicinalProduct();

  Optional<Meta> meta();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Reference>> masterFile();

  Optional<List<ResourceList>> contained();

  Optional<Id> id();

  Optional<CodeableConcept> additionalMonitoringIndicator();

  static ImmutableMedicinalProduct.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProduct.builder();
  }
}
