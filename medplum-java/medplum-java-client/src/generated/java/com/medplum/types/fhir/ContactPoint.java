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
    as = ImmutableContactPoint.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ContactPoint {
  Optional<ContactpointUse> use();

  Optional<String> value();

  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<ContactpointSystem> system();

  Optional<String> id();

  Optional<PositiveInt> rank();

  static ImmutableContactPoint.Builder builder() {
    return ImmutableContactPoint.builder();
  }
}
