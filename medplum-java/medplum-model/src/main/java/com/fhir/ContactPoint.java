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
    as = ImmutableContactPoint.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ContactPoint {
  Optional<String> id();

  Optional<positiveInt> rank();

  Optional<ContactpointSystem> system();

  Optional<String> value();

  Optional<Period> period();

  Optional<ContactpointUse> use();

  Optional<List<Extension>> extension();

  static ImmutableContactPoint.Builder builder() {
    return ImmutableContactPoint.builder();
  }
}
