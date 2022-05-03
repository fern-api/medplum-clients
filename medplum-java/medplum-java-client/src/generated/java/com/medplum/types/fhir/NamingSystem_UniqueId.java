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
    as = ImmutableNamingSystem_UniqueId.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface NamingSystem_UniqueId {
  Optional<Boolean> preferred();

  Optional<String> value();

  Optional<String> comment();

  Optional<List<Extension>> extension();

  Optional<Namingsystem_uniqueidType> type();

  Optional<Period> period();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableNamingSystem_UniqueId.Builder builder() {
    return ImmutableNamingSystem_UniqueId.builder();
  }
}
