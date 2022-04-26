package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TestScript_Destination}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Destination.builder()}.
 */
@Generated(from = "TestScript_Destination", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Destination implements TestScript_Destination {
  private final Coding profile;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Integer index;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableTestScript_Destination(
      Coding profile,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Integer index,
      @Nullable List<Extension> modifierExtension) {
    this.profile = profile;
    this.extension = extension;
    this.id = id;
    this.index = index;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Coding profile() {
    return profile;
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code index} attribute
   */
  @JsonProperty("index")
  @Override
  public Optional<Integer> index() {
    return Optional.ofNullable(index);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestScript_Destination#profile() profile} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profile
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestScript_Destination withProfile(Coding value) {
    if (this.profile == value) return this;
    Coding newValue = Objects.requireNonNull(value, "profile");
    return new ImmutableTestScript_Destination(newValue, this.extension, this.id, this.index, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Destination#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Destination withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Destination(this.profile, newValue, this.id, this.index, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Destination#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Destination withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Destination(this.profile, value, this.id, this.index, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Destination#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Destination withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Destination(this.profile, this.extension, newValue, this.index, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Destination#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Destination withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Destination(this.profile, this.extension, value, this.index, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Destination#index() index} attribute.
   * @param value The value for index
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Destination withIndex(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.index, newValue)) return this;
    return new ImmutableTestScript_Destination(this.profile, this.extension, this.id, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Destination#index() index} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for index
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Destination withIndex(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.index, value)) return this;
    return new ImmutableTestScript_Destination(this.profile, this.extension, this.id, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Destination#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Destination withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Destination(this.profile, this.extension, this.id, this.index, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Destination#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Destination withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Destination(this.profile, this.extension, this.id, this.index, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Destination} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Destination
        && equalTo((ImmutableTestScript_Destination) another);
  }

  private boolean equalTo(ImmutableTestScript_Destination another) {
    return profile.equals(another.profile)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(index, another.index)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code profile}, {@code extension}, {@code id}, {@code index}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + profile.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(index);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Destination} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Destination{");
    builder.append("profile=").append(profile);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (index != null) {
      builder.append(", ");
      builder.append("index=").append(index);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestScript_Destination", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Destination {
    @Nullable Coding profile;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Integer> index = Optional.empty();
    boolean indexIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("profile")
    public void setProfile(Coding profile) {
      this.profile = profile;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("index")
    public void setIndex(Optional<Integer> index) {
      this.index = index;
      this.indexIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Coding profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> index() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Destination fromJson(Json json) {
    ImmutableTestScript_Destination.Builder builder = ((ImmutableTestScript_Destination.Builder) ImmutableTestScript_Destination.builder());
    if (json.profile != null) {
      builder.profile(json.profile);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.indexIsSet) {
      builder.index(json.index);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableTestScript_Destination) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Destination} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Destination instance
   */
  public static TestScript_Destination copyOf(TestScript_Destination instance) {
    if (instance instanceof ImmutableTestScript_Destination) {
      return (ImmutableTestScript_Destination) instance;
    }
    return ((ImmutableTestScript_Destination.Builder) ImmutableTestScript_Destination.builder())
        .profile(instance.profile())
        .extension(instance.extension())
        .id(instance.id())
        .index(instance.index())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Destination TestScript_Destination}.
   * <pre>
   * ImmutableTestScript_Destination.builder()
   *    .profile(com.fhir.types.fhir.Coding) // required {@link TestScript_Destination#profile() profile}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Destination#extension() extension}
   *    .id(String) // optional {@link TestScript_Destination#id() id}
   *    .index(Integer) // optional {@link TestScript_Destination#index() index}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Destination#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new TestScript_Destination builder
   */
  public static ProfileBuildStage builder() {
    return new ImmutableTestScript_Destination.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Destination TestScript_Destination}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript_Destination", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProfileBuildStage, BuildFinal {
    private static final long INIT_BIT_PROFILE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_INDEX = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Coding profile;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Integer index;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link TestScript_Destination#profile() profile} attribute.
     * @param profile The value for profile 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Coding profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      initBits &= ~INIT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Destination#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Destination#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Destination#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Destination#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Destination#index() index} to index.
     * @param index The value for index
     * @return {@code this} builder for chained invocation
     */
    public final Builder index(int index) {
      checkNotIsSet(indexIsSet(), "index");
      this.index = index;
      optBits |= OPT_BIT_INDEX;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Destination#index() index} to index.
     * @param index The value for index
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("index")
    public final Builder index(Optional<Integer> index) {
      checkNotIsSet(indexIsSet(), "index");
      this.index = index.orElse(null);
      optBits |= OPT_BIT_INDEX;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Destination#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Destination#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link TestScript_Destination TestScript_Destination}.
     * @return An immutable instance of TestScript_Destination
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Destination build() {
      checkRequiredAttributes();
      return new ImmutableTestScript_Destination(profile, extension, id, index, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean indexIsSet() {
      return (optBits & OPT_BIT_INDEX) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean profileIsSet() {
      return (initBits & INIT_BIT_PROFILE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Destination is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!profileIsSet()) attributes.add("profile");
      return "Cannot build TestScript_Destination, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "TestScript_Destination", generator = "Immutables")
  public interface ProfileBuildStage {
    /**
     * Initializes the value for the {@link TestScript_Destination#profile() profile} attribute.
     * @param profile The value for profile 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal profile(Coding profile);
  }

  @Generated(from = "TestScript_Destination", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestScript_Destination#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link TestScript_Destination#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link TestScript_Destination#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link TestScript_Destination#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link TestScript_Destination#index() index} to index.
     * @param index The value for index
     * @return {@code this} builder for chained invocation
     */
    BuildFinal index(int index);

    /**
     * Initializes the optional value {@link TestScript_Destination#index() index} to index.
     * @param index The value for index
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal index(Optional<Integer> index);

    /**
     * Initializes the optional value {@link TestScript_Destination#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript_Destination#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link TestScript_Destination TestScript_Destination}.
     * @return An immutable instance of TestScript_Destination
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestScript_Destination build();
  }
}
