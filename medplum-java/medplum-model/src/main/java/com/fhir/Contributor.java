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
    as = ImmutableContributor.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contributor {
  Optional<List<Extension>> extension();

  Optional<List<ContactDetail>> contact();

  Optional<String> name();

  Optional<String> id();

  Optional<ContributorType> type();

  static ImmutableContributor.Builder builder() {
    return ImmutableContributor.builder();
  }
}
