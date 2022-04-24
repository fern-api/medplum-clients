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
    as = ImmutableContactDetail.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ContactDetail {
  Optional<String> id();

  Optional<String> name();

  Optional<List<ContactPoint>> telecom();

  Optional<List<Extension>> extension();

  static ImmutableContactDetail.Builder builder() {
    return ImmutableContactDetail.builder();
  }
}
