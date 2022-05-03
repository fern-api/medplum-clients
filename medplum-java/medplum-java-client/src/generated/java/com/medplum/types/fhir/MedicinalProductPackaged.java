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
  Optional<Meta> meta();

  Optional<List<Reference>> manufacturer();

  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> extension();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<Reference> marketingAuthorization();

  Optional<String> description();

  Optional<List<Reference>> subject();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier();

  List<MedicinalProductPackaged_PackageItem> packageItem();

  Optional<List<Extension>> modifierExtension();

  static ImmutableMedicinalProductPackaged.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductPackaged.builder();
  }
}
