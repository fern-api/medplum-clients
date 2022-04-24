package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Reference referencedItem();

  Optional<List<CatalogEntry_RelatedEntry>> relatedEntry();

  Optional<code> language();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<List<Identifier>> additionalIdentifier();

  Optional<Boolean> orderable();

  Optional<List<CodeableConcept>> additionalClassification();

  Optional<List<ResourceList>> contained();

  Optional<dateTime> validTo();

  String resourceType();

  Optional<List<Extension>> extension();

  Optional<CatalogentryStatus> status();

  Optional<id> id();

  Optional<uri> implicitRules();

  Optional<List<CodeableConcept>> classification();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<List<Identifier>> identifier();

  Optional<Period> validityPeriod();

  Optional<dateTime> lastUpdated();

  Optional<List<CodeableConcept>> additionalCharacteristic();

  static ImmutableCatalogEntry.ReferencedItemBuildStage builder() {
    return ImmutableCatalogEntry.builder();
  }
}
