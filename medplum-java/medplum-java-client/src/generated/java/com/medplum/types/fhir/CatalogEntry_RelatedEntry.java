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
    as = ImmutableCatalogEntry_RelatedEntry.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CatalogEntry_RelatedEntry {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Catalogentry_relatedentryRelationtype> relationtype();

  Reference item();

  static ImmutableCatalogEntry_RelatedEntry.ItemBuildStage builder() {
    return ImmutableCatalogEntry_RelatedEntry.builder();
  }
}
