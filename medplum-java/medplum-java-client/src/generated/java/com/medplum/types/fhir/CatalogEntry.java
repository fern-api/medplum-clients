package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCatalogEntry.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CatalogEntry {
  Optional<List<Identifier>> additionalIdentifier();

  String resourceType();

  Optional<Narrative> text();

  Optional<DateTime> lastUpdated();

  Optional<List<CodeableConcept>> classification();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<Period> validityPeriod();

  Optional<List<Extension>> extension();

  Optional<DateTime> validTo();

  Optional<List<CatalogEntry_RelatedEntry>> relatedEntry();

  Optional<Boolean> orderable();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> type();

  Optional<List<Extension>> modifierExtension();

  Reference referencedItem();

  Optional<List<CodeableConcept>> additionalClassification();

  Optional<Code> language();

  Optional<CatalogentryStatus> status();

  Optional<List<CodeableConcept>> additionalCharacteristic();

  static ImmutableCatalogEntry.ResourceTypeBuildStage builder() {
    return ImmutableCatalogEntry.builder();
  }
}
