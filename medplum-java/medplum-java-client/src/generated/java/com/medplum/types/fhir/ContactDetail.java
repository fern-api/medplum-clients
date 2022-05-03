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
    as = ImmutableContactDetail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ContactDetail {
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> name();

  Optional<List<ContactPoint>> telecom();

  static ImmutableContactDetail.Builder builder() {
    return ImmutableContactDetail.builder();
  }
}
