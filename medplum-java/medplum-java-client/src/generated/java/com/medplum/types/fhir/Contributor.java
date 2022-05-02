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
    as = ImmutableContributor.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Contributor {
  Optional<List<ContactDetail>> contact();

  Optional<String> id();

  Optional<String> name();

  Optional<ContributorType> type();

  Optional<List<Extension>> extension();

  static ImmutableContributor.Builder builder() {
    return ImmutableContributor.builder();
  }
}
