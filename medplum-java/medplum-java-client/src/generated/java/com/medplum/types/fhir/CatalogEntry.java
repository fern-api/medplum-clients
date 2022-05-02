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
  Optional<Boolean> orderable();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> classification();

  Optional<List<CodeableConcept>> additionalCharacteristic();

  Optional<List<ResourceList>> contained();

  Optional<List<Identifier>> additionalIdentifier();

  Optional<List<Extension>> extension();

  Optional<List<Identifier>> identifier();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<Code> language();

  Optional<List<CodeableConcept>> additionalClassification();

  Optional<CodeableConcept> type();

  Optional<DateTime> lastUpdated();

  Optional<Period> validityPeriod();

  Optional<CatalogentryStatus> status();

  Reference referencedItem();

  Optional<DateTime> validTo();

  Optional<Meta> meta();

  Optional<List<CatalogEntry_RelatedEntry>> relatedEntry();

  String resourceType();

  Optional<Id> id();

  static ImmutableCatalogEntry.ReferencedItemBuildStage builder() {
    return ImmutableCatalogEntry.builder();
  }
}
