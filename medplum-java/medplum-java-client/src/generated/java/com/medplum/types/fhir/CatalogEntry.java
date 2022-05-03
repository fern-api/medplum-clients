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

  Optional<Uri> implicitRules();

  Optional<List<Identifier>> identifier();

  Reference referencedItem();

  Optional<DateTime> lastUpdated();

  Optional<List<CatalogEntry_RelatedEntry>> relatedEntry();

  Optional<Id> id();

  Optional<List<Extension>> modifierExtension();

  Optional<List<ResourceList>> contained();

  Optional<Period> validityPeriod();

  Optional<List<CodeableConcept>> additionalClassification();

  Optional<Meta> meta();

  Optional<List<Extension>> extension();

  Optional<Narrative> text();

  Optional<Boolean> orderable();

  String resourceType();

  Optional<DateTime> validTo();

  Optional<List<Identifier>> additionalIdentifier();

  Optional<CodeableConcept> type();

  Optional<CatalogentryStatus> status();

  Optional<List<CodeableConcept>> additionalCharacteristic();

  Optional<List<CodeableConcept>> classification();

  static ImmutableCatalogEntry.ReferencedItemBuildStage builder() {
    return ImmutableCatalogEntry.builder();
  }
}
