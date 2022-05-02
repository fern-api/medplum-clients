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
  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<Bundle_Entry>> entry();

  String resourceType();

  Optional<Instant> timestamp();

  Optional<UnsignedInt> total();

  Optional<Code> language();

  Optional<Uri> implicitRules();

  Optional<List<Bundle_Link>> link();

  Optional<BundleType> type();

  Optional<Identifier> identifier();

  Optional<Signature> signature();

  static ImmutableBundle.ResourceTypeBuildStage builder() {
    return ImmutableBundle.builder();
  }
}
