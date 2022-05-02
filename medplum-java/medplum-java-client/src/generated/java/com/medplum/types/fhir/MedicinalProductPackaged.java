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
    as = ImmutableMedicinalProductPackaged.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPackaged {
  Optional<List<ResourceList>> contained();

  Optional<List<Reference>> subject();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<List<Reference>> manufacturer();

  List<MedicinalProductPackaged_PackageItem> packageItem();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> marketingAuthorization();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> legalStatusOfSupply();

  String resourceType();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<String> description();

  Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier();

  static ImmutableMedicinalProductPackaged.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductPackaged.builder();
  }
}
