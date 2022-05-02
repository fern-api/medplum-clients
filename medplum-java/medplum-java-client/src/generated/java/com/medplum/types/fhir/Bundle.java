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
    as = ImmutableBundle.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Bundle {
  Optional<Instant> timestamp();

  Optional<Identifier> identifier();

  Optional<List<Bundle_Link>> link();

  Optional<List<Bundle_Entry>> entry();

  Optional<Code> language();

  Optional<UnsignedInt> total();

  Optional<Uri> implicitRules();

  Optional<Meta> meta();

  String resourceType();

  Optional<BundleType> type();

  Optional<Id> id();

  Optional<Signature> signature();

  static ImmutableBundle.ResourceTypeBuildStage builder() {
    return ImmutableBundle.builder();
  }
}
