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
  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Bundle_searchMode> mode();

  Optional<Decimal> score();

  Optional<String> id();

  static ImmutableBundle_Search.Builder builder() {
    return ImmutableBundle_Search.builder();
  }
}
