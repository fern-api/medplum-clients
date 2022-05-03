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
    as = ImmutableBundle_Search.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle_Search {
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<Bundle_searchMode> mode();

  Optional<Decimal> score();

  Optional<List<Extension>> modifierExtension();

  static ImmutableBundle_Search.Builder builder() {
    return ImmutableBundle_Search.builder();
  }
}
