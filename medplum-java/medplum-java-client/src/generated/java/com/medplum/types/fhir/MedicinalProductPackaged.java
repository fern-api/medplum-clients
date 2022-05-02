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

  Optional<List<Identifier>> identifier();

  Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier();

  Optional<List<Extension>> extension();

  Optional<String> description();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<Id> id();

  Optional<CodeableConcept> legalStatusOfSupply();

  List<MedicinalProductPackaged_PackageItem> packageItem();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Reference>> subject();

  Optional<Reference> marketingAuthorization();

  String resourceType();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Reference>> manufacturer();

  Optional<Meta> meta();

  Optional<Code> language();

  static ImmutableMedicinalProductPackaged.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductPackaged.builder();
  }
}
