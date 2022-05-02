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
    as = ImmutableAdverseEvent_SuspectEntity.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface AdverseEvent_SuspectEntity {
  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<AdverseEvent_Causality>> causality();

  Reference instance();

  Optional<List<Extension>> extension();

  static ImmutableAdverseEvent_SuspectEntity.InstanceBuildStage builder() {
    return ImmutableAdverseEvent_SuspectEntity.builder();
  }
}
