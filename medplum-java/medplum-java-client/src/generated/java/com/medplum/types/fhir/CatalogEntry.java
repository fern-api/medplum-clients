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
  Optional<Code> language();

  Optional<List<CodeableConcept>> classification();

  Optional<List<Identifier>> additionalIdentifier();

  Optional<List<CatalogEntry_RelatedEntry>> relatedEntry();

  Optional<Meta> meta();

  Optional<CodeableConcept> type();

  Reference referencedItem();

  Optional<List<Extension>> extension();

  Optional<Uri> implicitRules();

  Optional<List<CodeableConcept>> additionalClassification();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<List<CodeableConcept>> additionalCharacteristic();

  String resourceType();

  Optional<Period> validityPeriod();

  Optional<Boolean> orderable();

  Optional<Narrative> text();

  Optional<CatalogentryStatus> status();

  Optional<DateTime> lastUpdated();

  Optional<Id> id();

  Optional<List<Identifier>> identifier();

  Optional<DateTime> validTo();

  static ImmutableCatalogEntry.ReferencedItemBuildStage builder() {
    return ImmutableCatalogEntry.builder();
  }
}
