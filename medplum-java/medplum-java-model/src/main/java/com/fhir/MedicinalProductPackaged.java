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
    as = ImmutableMedicinalProductPackaged.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface MedicinalProductPackaged {
  Optional<List<Reference>> manufacturer();

  Optional<List<MedicinalProductPackaged_BatchIdentifier>> batchIdentifier();

  Optional<List<Extension>> extension();

  List<MedicinalProductPackaged_PackageItem> packageItem();

  Optional<id> id();

  Optional<Reference> marketingAuthorization();

  Optional<List<MarketingStatus>> marketingStatus();

  Optional<String> description();

  String resourceType();

  Optional<code> language();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> legalStatusOfSupply();

  Optional<uri> implicitRules();

  Optional<List<Reference>> subject();

  Optional<Meta> meta();

  static ImmutableMedicinalProductPackaged.ResourceTypeBuildStage builder() {
    return ImmutableMedicinalProductPackaged.builder();
  }
}
