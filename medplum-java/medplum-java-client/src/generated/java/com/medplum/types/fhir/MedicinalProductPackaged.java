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
  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<Id> id();

  Optional<List<Reference>> subject();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<String> description();

  String resourceType();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<Reference> marketingAuthorization();

  List<MedicinalProductPackaged_PackageItem> packageItem();

  Optional<List<ResourceList>> contained();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  Optional<List<Reference>> manufacturer();

  Optional<List<Extension>> extension();

  Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier();

  static ImmutableMedicinalProductPackaged.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductPackaged.builder();
  }
}
