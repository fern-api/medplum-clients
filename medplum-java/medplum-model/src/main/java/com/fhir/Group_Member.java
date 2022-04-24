package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableGroup_Member.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Group_Member {
  Reference entity();

  Optional<Boolean> inactive();

  Optional<String> id();

  Optional<Period> period();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  static ImmutableGroup_Member.EntityBuildStage builder() {
    return ImmutableGroup_Member.builder();
  }
}
